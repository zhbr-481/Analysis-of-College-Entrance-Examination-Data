<template>
    <div>
        <div class="title">2024年夏季高考文化成绩一分一段表</div>
        <table>
            <tr>
                <td class="font" rowspan="2">分数段</td>
                <td class="font" colspan="2">全体</td>
                <td class="font" colspan="2">选考物理</td>
                <td class="font" colspan="2">选考化学</td>
                <td class="font" colspan="2">选考生物</td>
                <td class="font" colspan="2">选考思想政治</td>
                <td class="font" colspan="2">选考历史</td>
                <td class="font" colspan="2">选考地理</td>
            </tr>
            <tr>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
                <td class="font">本段人数</td>
                <td class="font">累计人数</td>
            </tr>
            <tr v-for="(item, index) in scoresList" :key="index">
                <td>{{ item.score }}</td>
                <td>{{ item.thisNum }}</td>
                <td>{{ item.totolNum }}</td>
                <td>{{ item.wlthisNum }}</td>
                <td>{{ item.wltotolNum }}</td>
                <td>{{ item.hxthisNum }}</td>
                <td>{{ item.hxtotolNum }}</td>
                <td>{{ item.swthisNum }}</td>
                <td>{{ item.swtotolNum }}</td>
                <td>{{ item.szthisNum }}</td>
                <td>{{ item.sztotolNum }}</td>
                <td>{{ item.lsthisNum }}</td>
                <td>{{ item.lstotolNum }}</td>
                <td>{{ item.dlthisNum }}</td>
                <td>{{ item.dltotolNum }}</td>
            </tr>
        </table>
        <el-pagination
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page="params.pageNum"
            :page-sizes="[5, 10, 15, 20]"
            :page-size="params.pageSize"
            layout="total, sizes, prev, pager, next, jumper"
            :total="fenye.total">
        </el-pagination>
    </div>
</template>

<script>
import request from '@/utils/request';

export default {
    name: 'table2024Vue',
    async created() {
        await this.fetchData();
    },
    data() {
        return {
            scoresList: [],
            fenye: {},
            params: {
                pageNum: 1,
                pageSize: 35
            }
        }
    },
    methods: {
        async fetchData() {
            const result = await request.get("/zhaosheng/getscores24", {
                params: this.params
            });
            this.fenye = result.data;
            this.scoresList = result.data.list;
            console.log(result);
        },
        handleSizeChange(pagesize) {
            this.params.pageSize = pagesize;
            this.params.pageNum = 1;  // 重置到第一页
            this.fetchData(); // 更新数据
        },
        handleCurrentChange(pageNum) {
            this.params.pageNum = pageNum;
            this.fetchData(); // 更新数据
        }
    }
}
</script>

<style scoped>
    .title {
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        border: 1px solid black;
        text-align: center;
    }
    td {
        border: 1px solid black;
    }
    .font {
        font-weight: bold;
    }
</style>
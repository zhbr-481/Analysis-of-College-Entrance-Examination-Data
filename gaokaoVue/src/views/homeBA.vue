<template>
  <div>
    <el-card class="box-card" style="padding: 30px; border-radius: 20px">
      <div class="diyihang">
        <el-row :gutter="20">
          <el-col :span="4" class="tubiao">
            <img :src="currentData.school.logo" alt="School Logo">
          </el-col>
          <el-col :span="14">
            <h1>{{ currentData.school.name }}</h1>
            <h2>
              <span>{{ currentData.school.type }}</span>
              <span>{{ currentData.school.nature }}</span>
            </h2>
          </el-col>
          <el-col :span="6"></el-col>
        </el-row>
      </div>
      <br>
      <div class="dierpai">
        <el-row :gutter="20">
          <el-col :span="8">
            <div class="lunbo">
              <el-carousel :interval="5000" arrow="always" class="Carousel" height="300px">
                <el-carousel-item v-for="(image, index) in currentData.imageList" :key="index" class="el-carousel-item">
                  <img :src="image" alt="轮播图" style="width: 100%; height: 100%;">
                </el-carousel-item>
              </el-carousel>
            </div>
          </el-col>
          <el-col :span="16">
            <h4><i class="el-icon-link"></i>官方网址：</h4><a :href="currentData.school.website" target="_blank">{{ currentData.school.website }}</a>
            <h4><i class="el-icon-phone-outline"></i>招生电话：</h4><span>{{ currentData.school.phone }}</span>
            <h4><i class="el-icon-message"></i>电子邮箱：</h4><span>{{ currentData.school.email }}</span>
          </el-col>
        </el-row>
      </div>
      <br>
      <el-card class="box-card" style="padding: 30px; border-radius: 20px">
        <el-header class="el-header">
          <div><p style="font-weight: bold; font-size: 35px; color: dimgray; font-family: '华文新魏';">校园风光</p></div>
        </el-header>
        <br>
        <el-row :gutter="20" class="row">
          <el-col v-for="(image, index) in currentData.campusImages.slice(0, 3)" :key="index" :span="8">
            <img :src="image" alt="Campus Image">
          </el-col>
        </el-row>
        <br>
        <el-row :gutter="20" class="row">
          <el-col v-for="(image, index) in currentData.campusImages.slice(3, 6)" :key="index + 3" :span="8">
            <img :src="image" alt="Campus Image">
          </el-col>
        </el-row>
      </el-card>
    </el-card>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dataCollections: {
        region1: {
          imageList: [
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_7261_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_5706_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_2467_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_5448_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_1374_thumb.png'
          ],
          school: {
            name: '山东商业职业技术学院',
            type: '专科',
            nature: '公办',
            website: 'http://www.sict.edu.cn/',
            phone: '0531-86335555',
            email: 'sdsyzs@163.com',
            logo: 'https://static-data.gaokao.cn/upload/logo/2097.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_7261_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_5706_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_2467_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_5448_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202028/1609135809_1374_thumb.png'
          ]
        },
        region2: {
          imageList: [
                'https://static-data.gaokao.cn/upload/school/202116/1618559802_8970_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202002/1606887511_5913_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202002/1606887512_6854_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202002/1606887512_7061_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202002/1606887512_4107_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202002/1606887512_5079_thumb.jpg'
              ],
          school: {
            name: '山东大学',
            type: '本科',
            nature: '公办',
            website: ' https://www.sdu.edu.cn/',
            phone: '0531-59626977',
            email: 'sdbkzs@email.sdu.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/126.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/202116/1618559802_8970_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202002/1606887511_5913_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202002/1606887512_6854_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202002/1606887512_7061_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202002/1606887512_4107_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202002/1606887512_5079_thumb.jpg'
          ]
        },
        region3: {
          imageList: [
            'https://static-data.gaokao.cn/upload/school/201910/1554878427_7238_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827258_7617_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827258_1472_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827258_9924_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827258_7659_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827258_4334_thumb.jpg'
          ],
          school: {
            name: '中国海洋大学',
            type: '本科',
            nature: '公办',
            website: ' http://www.ouc.edu.cn/',
            phone: '0532-66782426,0532-66781723',
            email: 'ouczsb@ouc.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/61.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/201910/1554878427_7238_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827258_7617_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827258_1472_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827258_9924_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827258_7659_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827258_4334_thumb.jpg' ]
        },
        region4: {
          imageList: [
              'https://static-data.gaokao.cn/upload/school/202119/1618797757_9921_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559821526_5213_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559821526_7194_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559821526_3808_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559821526_4016_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201910/1554878325_7053_thumb.jpg'
            ],
          school: {
            name: '中国石油大学',
            type: '本科',
            nature: '公办',
            website: 'http://www.upc.edu.cn/',
            phone: '0532-86983086',
            email: 'zhaosheng@upc.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/120.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/202119/1618797757_9921_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559821526_5213_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559821526_7194_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559821526_3808_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559821526_4016_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201910/1554878325_7053_thumb.jpg']
        },
        region5: {
          imageList: [
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_1957_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827074_6549_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827074_3355_thumb.jpg' ,
              'https://static-data.gaokao.cn/upload/school/201906/1559827074_6673_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827074_6806_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559817541_8356_thumb.jpg'
          ],
          school: {
            name: '青岛科技大学',
            type: '本科',
            nature: '公办',
            website: 'https://www.qust.edu.cn/',
            phone: '0532-88957996',
            email: 'zsb@qust.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/507.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_1957_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_6549_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_3355_thumb.jpg' ,
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_6673_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827074_6806_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559817541_8356_thumb.jpg'
          ]
        },
        region6: {
          imageList: [
           'https://static-data.gaokao.cn/upload/school/201906/1559827091_3980_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202213/1655111438_2869_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827091_4719_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827091_4896_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202213/1655111438_6711_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/201906/1559827091_7828_thumb.jpg'
          ],
          school: {
            name: '青岛理工大学',
            type: '本科',
            nature: '公办',
            website: 'https://www.qut.edu.cn/',
            phone: '0531-85071039',
            email: 'zhshb@qut.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/509.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/201906/1559827091_3980_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202213/1655111438_2869_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827091_4719_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827091_4896_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202213/1655111438_6711_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/201906/1559827091_7828_thumb.jpg'
          ]
        },
        region7: {
          imageList: [
            'https://static-data.gaokao.cn/upload/school/202119/1618815909_5657_thumb.png',
             'https://static-data.gaokao.cn/upload/school/202004/1607062951_3319_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202004/1607062951_5203_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202004/1607062951_4462_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202004/1607062951_6025_thumb.jpg',
              'https://static-data.gaokao.cn/upload/school/202004/1607062951_4164_thumb.jpg'
          ],
          school: {
            name: '临沂大学',
            type: '本科',
            nature: '公办',
            website: 'https://www.lyu.edu.cn/',
            phone: '0539-7258226,0539-7258227,0539-7258777',
            email: 'zsb@lyu.edu.cn',
            logo: 'https://static-data.gaokao.cn/upload/logo/496.jpg'
          },
          campusImages: [
            'https://static-data.gaokao.cn/upload/school/202119/1618815909_5657_thumb.png',
            'https://static-data.gaokao.cn/upload/school/202004/1607062951_3319_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202004/1607062951_5203_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202004/1607062951_4462_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202004/1607062951_6025_thumb.jpg',
            'https://static-data.gaokao.cn/upload/school/202004/1607062951_4164_thumb.jpg']
        },

      },
      currentData: {}
    };
  },
  created() {
    const region = this.$route.query.region;
    this.currentData = this.dataCollections[region] || {};
  },
}
</script>

<style scoped lang="less">
.row {
  img {
    width: 100%; // 确保图片在列中占满宽度
    height: auto;
    border-radius: 20px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); // 添加阴影效果
    transition: transform 0.3s ease; // 添加过渡效果
    &:hover {
      transform: scale(1.05); // 鼠标悬停时放大效果
    }
  }
}
.tubiao {
  img {
    height: 150px; // 调整 logo 的高度
    width: auto;
    margin: 0 auto; // 居中 logo
    display: block;
  }
}
h1 {
  font-size: 28px;
  color: #333; // 修改为更深的颜色
  margin: 0;
}
h2 {
  margin-top: 10px;
  span {
    display: inline-block;
    padding: 5px 10px;
    text-align: center;
    background-color: #f1f1f1;
    border-radius: 50px;
    margin-right: 10px;
    font-size: 14px;
    color: #555;
  }
}
.el-card {
  box-shadow: 0 4px 16px rgba(0, 0, 0, 0.1); // 卡片阴影
  transition: box-shadow 0.3s ease;
  &:hover {
    box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
  }
}
.lunbo {
  .Carousel {
    border-radius: 10px;
  }
}
.diyihang, .dierpai {
  margin-bottom: 30px; // 增加行间距
}
</style>
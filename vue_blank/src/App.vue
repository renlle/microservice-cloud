<template>
  <div class="courseDetailWrapper">
    <!--头部条目-->
    <div class="courseDetailHeader">
      <!--头部条目,图片-->
      <div class="courseDetailPhoto">
        <img src="./assets/htmlCourse.png">
      </div>
      <!--头部条目,右侧-->
      <div class="headerLeft">
        <div class="courseTitle">
          HTML 基础课程
        </div>
        <div class="courseStar">
          <i class="el-icon-star-off"></i>
        </div>
        <br>
        <div class="courseInfo">
          <span>524</span>人学过&nbsp;&nbsp;&nbsp;&nbsp;
          <span>44</span>人收藏
        </div>
        <div class="courseBrief">
          超文本标记语言（英语：HyperText Markup Language，简称：HTML）是一种用于创建网页的标准标记语言。
          您可以使用 HTML 来建立自己的 WEB 站点，HTML 运行在浏览器上，由浏览器来解析。
          在本教程中，您将学习如何使用 HTML 来创建站点。
          HTML 很容易学习！相信您能很快学会它！
        </div>
        <div class="btnBig">
          <el-button type="success">开始学习</el-button>
        </div>
      </div>
    </div>

    <!--主框-->
    <div class="courseDetailSection">
      <div class="courseTopicTitle">课程章节</div>

      <div class="courseItem">
        <div class="courseItemTitle">
          第0章-测试跳转 <br>
          <a v-on:click="send('add')">测试8001dept 添加操作</a>
          <input type="text" v-model="addData"> <br>

          <a v-on:click="send('findAll')">测试findAll</a><br>

          <a v-on:click="send('findById')" v-model="findId">测试findById</a>
          <input type="text" v-model="findId"><br><br>

        </div>
      </div>
      <div class="courseItem">
        <p v-model="testAnswer">测试结果::::  {{testAnswer}}</p>
      </div>

      <div class="courseItem">
        <div class="courseItemTitle">
          第一章 网站基础相关概念
          <div class="courseItemBtn">
            <el-button type="success">开始学习</el-button>
          </div>
        </div>
        <div class="courseItemBrief">
          知识点: 1.HTTP基础 2.网站是什么 3.浏览器访问 4.网站的文件处理
        </div>
      </div>
      <div class="courseItem">
        <div class="courseItemTitle">
          第二章 HTML简介(上)
          <div class="courseItemPrompt">
            请按照顺序进行学习
          </div>
        </div>
        <div class="courseItemBrief">
          知识点: 1.HTTP基础 2.网站是什么 3.浏览器访问 4.网站的文件处理
        </div>
      </div>
      <div class="courseItem">
        <div class="courseItemTitle">第三章 HTML简介(下)</div>
        <div class="courseItemBrief">
          知识点: 1.HTTP基础 2.网站是什么 3.浏览器访问 4.网站的文件处理
        </div>
      </div>
    </div>

    <!--右侧边框: 课程教师-->
    <div class="courseDetailAsideOfTeacher">
      <div  class="asideTitle">课程教师</div>
      <hr style="size: 1px;width: 430px;align-self: center"/>
      <div class="asidePicture">
        <img src="./assets/head-picture.jpg" alt="">
      </div>
      <div class="teacherName">酱油君</div>
      <div class="teacherBrief">共发布3门课程</div>
      <div class="teacherCourseAll"><br><br><br><br><a href="#">查看教师发布的所有课程>></a></div>
    </div>
    <!--右侧边框: 相似课程-->
    <div class="courseDetailAsideOfSimilar">
      <div  class="asideTitle">相似课程</div>
      <hr style="size: 1px;width: 430px;align-self: center"/>
      <ul>
        <li>CSS 基础课程</li>
        <li>JavaScript 基础课程</li>
        <li>基础Canvas实现放大镜效果</li>
        <li>纯前端打造实时markdown编辑器</li>
      </ul>
    </div>
  </div>
</template>

<script>
  import axios from 'axios'
  export default {
  name: 'App',
  data() {
    return {
      addData: 'test',
      findId: 1,
      testAnswer: []
    }
  },
  methods:{
    //发送ajax请求
    send: function (name) {
      let Url = '';
      if (name === 'add') {
        this.addData  =Math.floor((Math.random()*1000)+1);

        console.log('+'+this.addData+"----------this.addData----------");

        Url = 'http://localhost:8001/provider/add/' + this.addData
      } else if (name === 'findAll') {
        Url = 'http://localhost:8001/provider/findAll'
      } else {
        Url = 'http://localhost:8001/provider/findById/' + this.findId
      }
      const listItem = [];
      axios({
        method: 'get',
        url : Url
      }).then( (res)=>{
        console.log(res.data+"----------res.data----------");
        if(res.data )
          listItem .push( res.data);
        else
          listItem .push( 'null-----------');
        console.log(listItem+"----------listItem----------")
      });

      // //解析数据
      // for(let i=0;i<this.message.data.length;i++){
      //   console.log(this.message.data[i].firstChild)
      // }
      this.testAnswer = listItem
    }
  }
}
</script>

<style>
  ul li{
    margin-top: 28px;
    font-family: "PingFang-SC-Regular";
    font-size: 16px;
    color: #666666;
  }
  a{
    text-decoration:none;
    color:blue;
  }
  .teacherCourseAll{
    text-align: right;
  }
  .teacherBrief{
    magin:0 6px;
    margin-top: 10px;
    font-family: "PingFang-SC-Regular";
    font-size: 16px;
    color: #666666;
  }
  .teacherName{
    magin-left: 6px;
    font-family: "PingFang-SC-Regular";
    font-size: 18px;
    color: #333333;
  }
  .asidePicture img{
    width: 100px;
    height: 100px;
    padding-bottom: 30px;
    margin-left: 20px;
  }
  .asidePicture{
    float: left;
  }
  .asideTitle{
    margin: 14px 0px 14px 16px;
    font-family: "PingFang-SC-Regular";
    font-size: 22px;
    color: #333333;
  }
  .courseItemPrompt{
    font-family: "PingFang-SC-Medium";
    font-size: 14px;
    color: #1fad4e;
    text-align: right;
  }
  .courseItemBtn button{
    /*position: absolute;*/
    font-family: "PingFang-SC-Medium";
    font-size: 14px;
    color: #ffffff;
    background-color: #1fad4e;
    vertical-align: bottom;
    margin-right: -10px;
  }
  .courseItemBtn{
    float: right;
    vertical-align: bottom;
    margin-right: 20px;
    margin-top: 30px;
    display: inline-block;
  }
  .courseItemBrief{
    font-family: "PingFang-SC-Medium";
    font-size: 16px;
    color: #999999;
    width: auto;
    /*float: left;*/
  }
  .courseItemTitle{
    font-family: "PingFang-SC-Medium";
    font-size: 22px;
    color: #1c1f21;
    /*padding-bottom: 40px;*/
    height: 66px;
    /*float: left;*/
  }
  .courseItem{
    height: 110px ;
    min-width: 1340px;
    width: auto;
    background-color: #EEEEEE;
    padding: 14px;
    margin-top: 20px;
    position: relative;
  }
  .courseTopicTitle{
    font-family: "PingFang-SC-Medium";
    font-size: 24px;
    color: #333333;
  }
  .courseStar{
    float: right;
    font-size: 40px;
  }
  .btnBig button{
    /*color: #1fad4e;*/
    border-radius: 6px;
    width: 140px;
    height: 40px;
    font-family: "PingFang-SC-Medium";
    font-size: 18px;
    color: #ffffff;
    background-color: #1fad4e;
  }
  .btnBig{
    margin-top:30px ;

  }
  .courseBrief{
    font-family: "PingFang-SC-Regular";
    font-size: 18px;
    color: #666666;
    margin-top: 20px;
  }
  .courseInfo{
    font-family: "PingFang-SC-Medium";
    font-size: 20px;
    color: #666666;
    padding-top: 20px;
  }
  .courseInfo span{
    font-family: "PingFang-SC-Regular";
    font-size: 22px;
    color: #1fad4e;
  }
  .courseTitle{
    font-family: "PingFang-SC-Medium";
    font-size: 26px;
    color: #1c1f21;
    float: left;
  }
  .courseDetailAsideOfSimilar{
    margin-left: 20px;
    margin-top: 20px;
    width: 460px;
    height: 270px;
    background-color:white;
    float: left;
  }
  .courseDetailAsideOfTeacher{
    float: left;
    margin-top: 20px;
    margin-left: 20px;
    width: 460px;
    height: 268px;
    background-color:white;
  }
  .courseDetailPhoto{
    float: left;
    margin: 0px 28px 30px 14px;
  }
  .courseDetailSection{
    margin-top: 20px;
    float: left;
    width: 1371px;
    background-color:white;
    height: 840px;
    padding: 18px 14px 0 14px;
  }
  .courseDetailHeader{
    padding-top: 26px;
    height: 285px;
    width: 1882px;
    background-color:white;
  }
  .courseDetailWrapper{
    width: 1882px;
    height: 1265px;
    margin: 20px 20px 20px 18px;
    /*background-color:white;*/
  }

html,body {
  height: 100%;
  margin: 0;
  padding: 0;
  /*灰白色*/
  background-color: #EEEEEE;
  align:center;
}
.authorInfo p {
  margin: 0;
  height: 40px;
  color: #fff;
  background: #666;
  line-height: 40px;
  font-size: 18px;
  padding-left: 18px;
}
.footer i {
  margin: 20px 0 0 24px;
  font-size: 24px;
}
.footer i:hover{
  cursor: pointer;
}
</style>

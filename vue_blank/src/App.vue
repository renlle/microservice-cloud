<template>
  <div class="courseDetailWrapper">
    <!--上面条目-->
    <div class="courseDetailHeader">
      <div class="courseDetailPhoto">
        <img src="./assets/htmlCourse.png">
      </div>
      <div class="headerLeft">
        <div class="courseTitle">
          HTML 基础课程
        </div>
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
          <el-button round>开始学习</el-button>
        </div>

      </div>

    </div>
    <!--主框-->
    <div class="courseDetailSection">
      <h2>主框 courseDetailSection</h2>
    </div>
    <!--右侧边框: 课程教师-->
    <div class="courseDetailAsideOfTeacher">
      <h3>课程教师</h3>
    </div>
    <!--右侧边框: 相似课程-->
    <div class="courseDetailAsideOfSimilar">
      <h3>相似课程 courseDetailAsideOfSimilar</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
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
  }
  .courseDetailAsideOfSimilar{
    margin-left: 20px;
    margin-top: 20px;
    width: 481px;
    background-color:white;
    float: left;
  }
  .courseDetailAsideOfTeacher{
    float: left;
    margin-top: 20px;
    margin-left: 20px;
    width: 481px;
    background-color:white;
  }
  .courseDetailPhoto{
    float: left;
    margin: 0px 28px 30px 14px;
  }
  .courseDetailSection{
    margin-top: 20px;
    float: left;
    width: 1381px;
    background-color:white;
    height: 840px;
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

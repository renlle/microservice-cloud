<template>
  <div class="courseDetailWrapper">
    <!--上面条目-->
    <div class="courseDetailHeader">
      <div class="courseDetailPhoto">
        <img src="./assets/htmlCourse.png">
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
  margin: 26px 28px 30px 14px;
}
.courseDetailSection{
  margin-top: 20px;
  float: left;
  width: 1381px;
  background-color:white;
  height: 840px;
}
.courseDetailWrapper{
  width: 1882px;
  height: 1265px;
  margin: 20px 20px 20px 18px;
  /*background-color:white;*/
}
.courseDetailHeader{
  height: 285px;
  width: 1882px;
  background-color:white;
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

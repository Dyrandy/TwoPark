
<template>
  <div>
    <div class="userinfo-page">
      <div class="form" id="check">
        <b>P4rkJW</b>
      <hr weight="500px">
        ID : wr4gcmoima <br>
        Nickname : P4rkJW <br>
        Email : wr4gcmoima@naver.com
       </div>
      </div>
        <center>
    <font style="font-family: 'Chilanka', sans-serif; font-size: 30px;" ><h1>User Written Board</h1></font>
    <board-list></board-list>
        </center>
  </div>
</template>



<script>
  import boardList from "../board/boardList";

    export default {
        components :{
            'boardList' : boardList
        },
        name : 'userinfo'
    }
</script>

<style scoped>
  @import url(https://fonts.googleapis.com/css?family=Chilanka);
  @import url(https://fonts.googleapis.com/css?family=Roboto:300);

  .form {
    position: relative;
    z-index: 1;
    background: #FFFFFF;
    max-width: 800px;
    margin: 0px 0px 0px 0px;
    padding: 45px;
    text-align: left;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  }

  .userinfo-page {
    width: 800px;
    padding: 3% 0 0;
    margin: auto;
  }
</style>

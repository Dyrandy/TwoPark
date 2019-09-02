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

    <span><h1>User Written Board</h1></span>
  <table class="boardTable">
    <tr class="tableHead">
      <th class="num">NUM</th>
      <th class="title">TITLE</th>
      <th class="madeBy"> MADE BY</th>
      <th class="date">DATE</th>
    </tr>

    <tr class="tableAttribute">
      <a href="#"><td class="num">Num</td></a>
      <td class="title"><a href="#">Title</a></td>
      <td class="madeBy"><a href="#">Made By</a></td>
      <td class="date"><a href="#">Date</a></td>
    </tr>
  </table>
</div>
</template>

<script>
    export default {
        name : 'userinfo'
    }
</script>

<style scoped>
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

  .boardTable{
    width: 100%;
    border-collapse: collapse;
    border: 1px solid #c7c7bc;
  }
  .tableHead, .tableAttribute{
    text-align: center;
  }
  .boardTable td, th{
    border: 1px solid #ccc;
    color: #404040;
  }

  table.boardTable a{
    display: block;
    text-decoration: none;
  }

  table.boardTable tr a:hover{
    background-color: orangered;
    color: white;
  }

  tr.tableHead {
    /*background-color: #82E000;*/
    background-image: linear-gradient(to bottom right, orangered, yellow);
  }
  th{
    color: white;
    height: 40px;
  }
  td{
    height: 30px;
  }

  .title{
    width: 50%;
  }
  .num {
    width: 10%;
  }
  .madeBy{
    width: 20%;
  }
  .date{
    width: 20%;
  }
</style>

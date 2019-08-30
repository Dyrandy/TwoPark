<template>
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
</template>
.
<script>
    export default {
        name: "boardList"
    }
</script>

<style scoped>
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

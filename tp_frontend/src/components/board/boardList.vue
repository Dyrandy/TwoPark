<template>
  <table class="boardTable">
    <tr class="tableHead">
      <div class="buttonGroup">
        <th class="num">NUM</th>
        <th class="title">TITLE</th>
        <th class="madeBy"> MADE BY</th>
        <th class="date">DATE</th>
      </div>
    </tr>

    <tr class="tableAttribute">
      <td class="num"><a href="#">Num</a></td>
      <td class="title"><a href="#">Title</a></td>
      <td class="madeBy"><a href="#">Made By</a></td>
      <td class="date"><a href="#">Date</a></td>
    </tr>
  </table>
</template>

<script>
    export default {
        name: "boardList"
    }
</script>

<style scoped>
  body{
    width: 80%;
    padding-left: 10%;
    padding-right: 10%;
  }

  .boardTable{
    padding-top: 100px;
    width: 100%;
    border-collapse: collapse;
    border: 1px solid #c7c7bc;
  }
  .tableHead, .tableAttribute{
    text-align: center;
  }
  .boardTable td{
    border: 1px solid #ccc;
    color: #404040;
  }
  table.boardTable td a{
    display: block;
    width: 100%;
    height: 100%;
    text-decoration: none;
  }

  table.boardTable tr a:hover{
    background-color: #82E0FF;
  }

  tr.tableHead {
    background-color: #82E000;
  }
</style>

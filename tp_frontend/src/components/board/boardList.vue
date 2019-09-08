<template>
  <div class="form">
    <button class="write" onclick="window.location='./boardWrite';">
      write
    </button>
    <table class="boardTable">
      <tr class="tableHead">
        <th class="num">NUM</th>
        <th class="title">TITLE</th>
        <th class="madeBy"> MADE BY</th>
        <th class="date">DATE</th>
      </tr>

      <tr class="tableAttribute" id="row1" onclick="window.location='./board/1';">
        <td class="num">Num</td>
        <td class="title">Title</td>
        <td class="madeBy">Made By</td>
        <td class="date">Date</td>
      </tr>
    </table>

    <form method="GET" action="" class="search">
      <input type="text" name="search" />
      <input type="submit" value="search"/>
    </form>

  </div>
</template>


<script>
    export default {
        name: "boardList"
    }

</script>

<style scoped>
  .boardTable{
    width: 100%;
    border-collapse: collapse;
    position: relative;
    z-index: 0;
    background: #FFFFFF;
    margin: 0px 0px 0px 0px;
    padding: 45px;
    text-align: center;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
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
    width: 100%;
  }

  #row1:hover{
    background-color: lightyellow;
    /*color: white;*/
  }

  tr.tableHead {
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

  .write{
    margin-top: 5px;
    margin-bottom: 10px;
    margin-left: 95%;
    /*margin-left: 80%;*/
    border-radius: 5px;
    background: #FFA500;
    color: white;
    padding: 8px;

  }

  .search{
    padding-top: 2%;
    text-align: center;
  }
</style>

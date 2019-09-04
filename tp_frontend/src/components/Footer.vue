<template>
  <footer>
    <div class="wrapper">
      <nav>
        <table class="bottomTable">
          <tr>
            <td>Made By : TwoPark</td>
          </tr>
          <tr>
            <td>Contact Us : 010-1234-1234</td>
          </tr>
          <tr>
            <td>Copyright © TwoPark All rights reserved.</td>
          </tr>
        </table>
        <div class="logo">
          <img src="../assets/cukLogo.png">
        </div>
      </nav>
    </div>
  </footer>
</template>

<script>
    export default {
        name: "main-footer"
    }
</script>

<style scoped>
  .wrapper{
    width: 90%;
    margin: auto;
  }
  footer{
    width: 80%;
    left: 10%;
    height: 80px;
    background-color :whitesmoke;
    position: fixed;
    bottom: 2%;
  }
  .logo{
    float: right;
    line-height: 75px;
    text-align : center;
  }
  .logo > img{
    vertical-align:middle;
  }
  .bottomTable{
    height: 80px;
    float:left;
    vertical-align: middle;
  }
</style>

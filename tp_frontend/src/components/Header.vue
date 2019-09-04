<template>
  <header>
    <div class="wrapper">
      <h1><a href="/">TwoPark</a></h1>
      <nav>
        <ul class = "menu">
          <li>
            <a href="/board">Board</a>
          </li>
          <li>
            <a href="/login">Login</a>
          </li>
          <li>
            <a href="/register">Register</a>
          </li>
        </ul>
      </nav>
    </div>
  </header>
</template>

<script>
    export default {
        name: "main-header"
    }
</script>

<style scoped>
  *{
    margin-top: 0;
  }
  li{
    list-style: none;
  }

  a{
    text-decoration: none;
    color: white;
  }

  .wrapper{
    width: 90%;
    margin: auto;
  }

  header{
    width: 80%;
    left: 10%;
    height: 75px;
    background-image: linear-gradient(to bottom right, red, yellow);
    position: fixed;
    top: 3%;

  }

  h1{
    color: white;
    line-height: 75px;
    float:left;
  }
  .menu{
    float:right;
  }
  .menu li{
    float:left;
  }
  .menu a{
    line-height: 75px;
    color: white;
    padding: 0 15px;
    display: block;
  }
</style>

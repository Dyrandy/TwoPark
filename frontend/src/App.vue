<template>
  <div id="app">
    <mainHeader></mainHeader>
    <router-view id="container"></router-view>
    <mainFooter id="footer"></mainFooter>
  </div>
</template>

<script>
    import mainHeader from './components/Header.vue';
    import mainFooter from './components/Footer.vue';
    import boardList from './components/board/boardList.vue';
    import userInfo from './components/userInfo/userInfo.vue';
    import boardWrite from './components/board/boardWrite.vue';
    import boardView from './components/board/boardView.vue';
    import login from './components/login/Login.vue';
    import index from './components/index.vue';

    export default {
        components: {
            'mainHeader': mainHeader,
            'mainFooter': mainFooter,
            'boardList': boardList,
            'userInfo' : userInfo,
            'boardWrite': boardWrite,
            'boardView': boardView,
            'login' : login,
            'index' : index
        }
    }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #2c3e50;
    margin-top: 60px;
  }
  #container{
    min-height: 480px;
  }

  #footer{
    padding-top: 2%;
    margin-right: 10%;
    position: relative;
  }
</style>

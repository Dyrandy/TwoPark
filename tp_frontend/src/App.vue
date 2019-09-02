<template>
  <div id="app">
    <mainHeader></mainHeader>
    <router-view></router-view>
    <mainFooter></mainFooter>
  </div>
</template>

<script>
  import mainHeader from './components/Header.vue';
  import mainFooter from './components/Footer.vue';
  import boardList from './components/board/boardList.vue';
  import userInfo from './components/userInfo/userInfo';
  import boardWrite from './components/board/boardWrite';

export default {
  components: {
      'mainHeader': mainHeader,
      'mainFooter': mainFooter,
      'boardList': boardList,
      'userInfo' : userInfo,
      'boardWrite': boardWrite
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /*text-align: center;*/
  color: #2c3e50;
  margin-top: 60px;
}
</style>

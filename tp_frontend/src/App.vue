<template>
  <div id="app">
    <mainHeader></mainHeader>
    <boardList></boardList>
    <register></register>
    <mainFooter></mainFooter>
  </div>
</template>

<script>
  import mainHeader from './components/Header.vue';
  import mainFooter from './components/Footer.vue';
  import boardList from './components/board/boardList.vue';
  import register from './components/register/register.vue';

export default {
  components: {
      'mainHeader': mainHeader,
      'mainFooter': mainFooter,
      'boardList': boardList
      'register' : register
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

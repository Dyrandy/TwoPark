<template>
  <div class="posting">
    <label><b>Text</b></label>
    <hr weight="500px">
    Things To Say1 <br>
    LINE2 <br>
    LINE3 <br>
    LINE4
    <br>
    <br>
    <a href="#">File</a>
  </div>
</template>

<script>
    export default {
        name: "boardView.vue"
    }
</script>

<style scoped>
  body{
    padding-left: 10%;
    padding-right: 10%;
  }

  .posting {
    border-radius: 5px;
    width: 96%;
    border-collapse: collapse;
    position: relative;
    /*z-index: 1;*/
    background: #FFFFFF;
    padding: 2%;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  }
</style>

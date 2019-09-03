<template>
  <div class="posting">
    <label>Title</label><br>
    <input type="text" placeholder="Title" disabled>
    <br>
    <label>Content</label><br>
    <textarea placeholder="Text" maxlength="1000" rows=10 disabled></textarea>
    <br>
  </div>
</template>

<script>
    export default {
        name: "boardView.vue"
    }
</script>

<style scoped>
  input[type=text]{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }
  textarea{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    resize: none;
  }
  input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  body{
    padding-left: 10%;
    padding-right: 10%;
  }

  .posting {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
  }
</style>

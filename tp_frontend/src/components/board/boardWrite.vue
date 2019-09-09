<template>
  <div>
  <div class="posting">
      <form action="" method="POST">
       <label>Title</label><input type="checkbox" id="checkbox" name="checkbox" value="secret"><br>
       <input type="text" placeholder="Title">
        <br>
        <label>Content</label><br>
       <textarea placeholder="Text" maxlength="1000" rows=10></textarea>
        <br>
       <label>File</label><br>
        <input type="file" name="file" value="upload">
        <br>
        <input type="submit" value="POST">
      </form>
    </div>
  </div>
</template>

<script>
    export default {
        name: "boardWrite.vue"
    }
</script>

<style scoped>
  input[type=text], select{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    background: #f2f2f2;
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
    background: #f2f2f2;
  }
  input[type=submit] {
    width: 100%;
    background: #FFA500;
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
    /* text-align: center; */
  }
  input[type=submit]:hover {
    background: #FFA54F;
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

<template>
  <div class="register-page">
    <div class="form" id="form">
      <h4>ID</h4><input type="text" value="P4rkJW" disabled><br>
      <h4>NickName</h4><input type="text"  value="ADMIN" disabled><br>
      <h4>Email</h4> <input type="email" value="wr4gcmoima@naver.com" disabled><br>
      <h4>Password</h4> <input type="password" v-model='pw' placeholder="Password"><br><h1></h1>
    </div>
    <button v-on:click="check">change Information</button>
    <button @click="close_account" style="background-color: #c7c7bc">Close Account </button>
  </div>
</template>

<script>
    export default {
        el : '#form',
        name: 'userInfoChange',
        data : {
            pw : ''
        },
        methods: {
            check: function(){
                if (!this.pw) {
                    alert('input your password')
                } else {
                    const baseURI = '/change_proc'
                this.$http.post(baseURI, {
                    pw: this.pw
                })
                    .then((result) => {
                        this.users = result.data
                    })
            }
            },
            close_account : function(){
                var bool = confirm("Do you want to close your Account?");
                if(bool) {
                    const baseURI = '/deleteAccount'
                    this.$http.post(baseURI, {
                        pw: this.pw
                    })
                        .then((result) => {
                            this.users = result.data
                        })
                }
            }
    }
 }
</script>


<style scoped>
  @import url(https://fonts.googleapis.com/css?family=Roboto:300);

  .register-page {
    width: 460px;
    padding: 3% 0 0;
    margin: auto;
  }
  .form {
    position: relative;
    z-index: 1;
    background: #FFFFFF;
    max-width: 360px;
    margin: 0px 0px 0px 0px;
    padding: 45px;
    text-align: center;
    box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
  }
  .form input {
    font-family: "Roboto", sans-serif;
    outline: 0;
    background: #f2f2f2;
    width: 100%;
    border: 0;
    margin: 0 0 0px;
    padding: 10px;
    box-sizing: border-box;
    font-size: 14px;
  }
  .register-page button {
    font-family: "Roboto", sans-serif;
    text-transform: uppercase;
    outline: 0;
    background: #4CAF50;
    width: 85%;
    border: 0;
    margin : 20px 0px 0px 35px;
    padding: 15px;
    color: #FFFFFF;
    font-size: 14px;
    -webkit-transition: all 0.3 ease;
    transition: all 0.3 ease;
    cursor: pointer;
  }
  .form button:hover,.form button:active,.form button:focus {
    background: #43A047;
  }
  .form .message {
    margin: 15px 0 0;
    color: #b3b3b3;
    font-size: 12px;
  }
  .form .message a {
    color: #4CAF50;
    text-decoration: none;
  }

  .form .register-form {
    display: none;
  }
</style>

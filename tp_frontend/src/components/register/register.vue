<template>
  <div class="register-page">
    <div class="form" id="check">
      <input type="text" v-model="id" placeholder="ID">
      <input type="text" v-model="nickname" placeholder="NickName">
      <input type="email" v-model="email" placeholder="Email">
      <input type="password" v-model="pw"placeholder="Password">
      <input type="password" v-model="repw" placeholder="Confirm Password">
      <button v-on:click="check()">Register</button>
    </div>
  </div>
</template>

<script>
    export default {
        el: '#check',
        data: {
            id: '',
            nickname: '',
            email: '',
            pw: '',
            repw: ''
        },
        methods: {
            check: function () {
                if (!this.id) {
                    alert('Input Your ID')
                }
                else if (!this.nickname) {
                    alert('Input Your NickName')
                } else if (!this.email) {
                    alert('Input Your Email')
                } else if (!this.pw) {
                    alert('Input Your Password')
                } else if (!this.repw) {
                    alert('Input Your Confirm Password')
                } else if (this.repw != this.pw) {
                    alert('NOT Match Your Password and Confirm Password')
                }
                else{
                    const baseURI = '/register_proc'
                    this.$http.post(baseURI, {
                        id: this.id,
                        pw : this.pw,
                        nickname : this.nickname,
                        email : this.email,
                        repw : this.repw
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
    width: 360px;
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
    margin: 0 0 15px;
    padding: 15px;
    box-sizing: border-box;
    font-size: 14px;
  }
  .form button {
    font-family: "Roboto", sans-serif;
    text-transform: uppercase;
    outline: 0;
    background: #4CAF50;
    width: 100%;
    border: 0;
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
</style>

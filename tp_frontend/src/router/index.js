import Vue from 'vue'
import Router from 'vue-router'
import boardList from '@/components/board/boardList.vue'
import register from '@/components/register/register.vue'
import userinfo from "../components/userinfo/userinfo";

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/board',
      name: 'boardList',
      component: boardList
    },
    {
      path: '/register',
      name: 'register',
      component: register
    },
    {
      path: '/userinfo',
      name: 'userinfo',
      component : userinfo
    }
  ]
})

import Vue from 'vue'
import Router from 'vue-router'
import boardList from '../components/board/boardList'
import register from '../components/register/register'
import userInfo from "../components/userInfo/userInfo"
import boardWrite from '../components/board/boardWrite'
import boardView from '../components/board/boardView'

Vue.use(Router);

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/board',
      name: 'boardList',
      component: boardList
    },
    {
      path: '/board/1',
      name: 'boardView',
      component: boardView
    },
    {
      path: '/boardWrite',
      name: 'boardWrite',
      component: boardWrite
    },
    {
      path: '/register',
      name: 'register',
      component: register
    },
    {
      path: '/userInfo',
      name: 'userInfo',
      component : userInfo
    }
  ]
})

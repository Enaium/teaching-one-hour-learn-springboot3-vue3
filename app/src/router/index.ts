import BookLayout from "@/layouts/BookLayout.vue";
import Books from "@/views/Books.vue";
import CreateBook from "@/views/CreateBook.vue";
import { createRouter, createWebHistory } from "vue-router";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: "/book",
      component: BookLayout,
      children: [
        {
          path: "",
          component: Books,
        },
        {
          path: "create",
          component: CreateBook,
        },
      ],
    },
  ],
});

export default router;

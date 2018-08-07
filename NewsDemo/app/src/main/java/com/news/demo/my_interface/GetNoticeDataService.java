package com.news.demo.my_interface;


import com.news.demo.model.NoticeList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetNoticeDataService {

    @GET("7.json?api-key=d7ccefb7d9dc4cba8758cc4b8ba1bddd")
    Call<NoticeList> getNoticeData();


}
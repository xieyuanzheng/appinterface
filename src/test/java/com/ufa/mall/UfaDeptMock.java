package com.ufa.mall;

import com.ufa.mall.entity.UfaDept;
import com.ufa.mall.mapper.UfaDeptMapper;
import com.ufa.mall.service.UfaDeptService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class UfaDeptMock {
    private UfaDept ufaDept;
    private UfaDeptMapper ufaDeptMapper;
    private UfaDeptService ufaDeptService;
    private UfaDeptMapper mockDao;

    @Before
    public void setUp() throws Exception {
        //模拟PersonDao对象
        mockDao = mock(UfaDeptMapper.class);
        when(mockDao.queryById(1)).thenReturn(new UfaDept(1,"总裁办"));
        ufaDeptService = new UfaDeptService(ufaDeptMapper);
    }

    @Test
    public void testUpdate() throws Exception {
        UfaDept result = ufaDeptService.queryById(1);
        //assert ( result);
        //验证是否执行过一次getPerson(1)
        verify(mockDao, times(1)).queryById(eq(1));

    }
}

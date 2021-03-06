package com.example.seecloud.database;

import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monkeysmac on 2017/4/10.
 */

public class InitAttribute {

    private List<Attribute> attributes = new ArrayList<>();

    private Attribute connectingTime =
            new Attribute("建联时间", "浏览器与Web服务器建立TCP/IP连接的消耗时间，TCP/IP连接三次握手的前两次握手的时间。");

    private Attribute firstPackageTime =
            new Attribute("首包时间", "IE浏览器发送HTTP请求结束开始，到收到Web服务器返回的第一个数据包的消耗时间。此指标包含了发送HTTP请求时最后一个数据包在网络上的传输时间、服务器响应此请求的时间和服务器回应的第一个数据包在网络上面的传输时间。");

    private Attribute firstScreenTime =
            new Attribute("首屏时间", "首屏时间是基调网络首创的评测网站用户体验的一个重要指标。它是指一个网站被浏览器如IE窗口上部1024*768的区域被充满所需时间,反映了用户在打开网站第一时间的感觉性能。");

    private Attribute totalDownloadTime =
            new Attribute("总下载时间", "总下载时间是监测一个页面总的消耗时间，即从开始监测到监测结束的时间。");

    private Attribute applicationServerResponseTime =
            new Attribute("应用服务器响应时间", "应用服务器从接到请求到返回响应的时间");

    private Attribute cpuUsage =
            new Attribute("CPU使用率", "系统、用户和IO等三个方面CPU占用比例");

    private Attribute databaseCallingTime =
            new Attribute("数据库调用时间", "每次业务请求消耗在数据库执行过程的时间");

    private Attribute apdex =
            new Attribute("Apdex指标", "根据对应用设定的T值计算得出的应用响应分数。Apdex指数 =(1×满意数量+0.5×可容忍数量)/总样本数，0代表没有满意用户，1则代表所有用户都满意");

    private Attribute serverMemoryTakeUp =
            new Attribute("服务器内存占用", "服务器系统中内存占用情况");

    //可能后期修改为主观意见参数
    private Attribute tingyunRank =
            new Attribute("听云排行", "tingyun.com给出的年度综合公有云服务排行榜提供的可参考性");

    private Attribute financialStrenth =
            new Attribute("资金实力", "企业为进行生产经营活动而有权长期独立支配和注用的自有资金，和企业依靠自有资金抵御外界环境变化的资金优势或能力");

    private Attribute operationStatus =
            new Attribute("运营状况", "企业运营状况是指企业的产品在商品市场上进行销售、服务的发展现状");

    private Attribute industryExp =
            new Attribute("业内经验", "企业经营企业的主要业务的经验和历史");

    private Attribute techRerverse =
            new Attribute("技术储备", "企业对于设备设施以及人才方面的储备情况");

    private Attribute qos =
            new Attribute("服务质量", "企业的网络能够利用各种基础技术，为指定的网络通信提供更好的服务能力, 是网络的一种安全机制， 是用来解决网络延迟和阻塞等问题的一种技术");

    private Attribute charges =
            new Attribute("收费情况", "企业对于服务以及其增值业务的收费情况");

    private Attribute dataSafety =
            new Attribute("数据安全", "企业为数据处理系统建立和采用的技术和管理的安全保护，保护计算机硬件、软件和数据不因偶然和恶意的原因遭到破坏、更改和泄露的能力");

    private Attribute desMatch =
            new Attribute("描述相符", "企业提供的产品和服务相比其宣传的内容的相似度");

    private Attribute rightPro =
            new Attribute("权益保障", "企业对于用户售后等固有权利的保障程度");


    public InitAttribute() {
        Attribute attribute[] = new Attribute[] {
            connectingTime, firstPackageTime, firstScreenTime, totalDownloadTime, applicationServerResponseTime,
                cpuUsage, databaseCallingTime, apdex, serverMemoryTakeUp,financialStrenth, operationStatus, industryExp, techRerverse,
                qos, charges, dataSafety, desMatch, rightPro
        };
        for (Attribute attr:attribute) {
            attributes.add(attr);
        }
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}

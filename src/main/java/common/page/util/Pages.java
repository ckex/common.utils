package common.page.util;

import java.io.Serializable;

/**
 * @author ckex
 * @date Jan 22, 2015 10:16:14 PM
 * @version V1.0
 * @ClassName: Pages
 * @Description: TODO[亲,给点描述吧 *_~ ]
 * @param <E>
 */
public class Pages<E> implements Serializable, Cloneable {

    private static final long serialVersionUID = -1255921459488525846L;

    private Paginator         paginator;

    private PageList<E>       pageList;

    protected Pages()
    {
        super();
    }

    public Pages(PageList<E> pageList)
    {
        super();
        this.pageList = pageList;
        this.paginator = pageList.getPaginator();
    }

    public Paginator getPaginator()
    {
        return paginator;
    }

    public void setPaginator(Paginator paginator)
    {
        this.paginator = paginator;
    }

    public PageList<E> getPageList()
    {
        return pageList;
    }

    public void setPageList(PageList<E> pageList)
    {
        this.pageList = pageList;
    }

}

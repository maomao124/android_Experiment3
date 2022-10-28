package mao.android_experiment3.entity;

/**
 * Project name(项目名称)：android_Experiment3
 * Package(包名): mao.android_experiment3.entity
 * Class(类名): GridViewInfo
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 10:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class GridViewInfo
{
    /**
     * 标题
     */
    private String title;

    /**
     * 图标
     */
    private int icon;

    /**
     * 内容
     */
    private String content;


    /**
     * Instantiates a new Grid view info.
     */
    public GridViewInfo()
    {

    }

    /**
     * Instantiates a new Grid view info.
     *
     * @param title   the title
     * @param icon    the icon
     * @param content the content
     */
    public GridViewInfo(String title, int icon, String content)
    {
        this.title = title;
        this.icon = icon;
        this.content = content;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    public GridViewInfo setTitle(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public int getIcon()
    {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     * @return the icon
     */
    public GridViewInfo setIcon(int icon)
    {
        this.icon = icon;
        return this;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     * @return the content
     */
    public GridViewInfo setContent(String content)
    {
        this.content = content;
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GridViewInfo that = (GridViewInfo) o;

        if (getIcon() != that.getIcon()) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null)
        {
            return false;
        }
        return getContent() != null ? getContent().equals(that.getContent()) : that.getContent() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + getIcon();
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("title：").append(title).append('\n');
        stringbuilder.append("icon：").append(icon).append('\n');
        stringbuilder.append("content：").append(content).append('\n');
        return stringbuilder.toString();
    }
}

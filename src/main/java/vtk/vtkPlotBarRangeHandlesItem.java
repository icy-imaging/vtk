// java wrapper for vtkPlotBarRangeHandlesItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotBarRangeHandlesItem extends vtkPlotRangeHandlesItem
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void GetBounds_4(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_4(id0);
  }

  private native void SetPlotBar_5(vtkPlotBar id0);
  public void SetPlotBar(vtkPlotBar id0)
  {
    SetPlotBar_5(id0);
  }

  private native long GetPlotBar_6();
  public vtkPlotBar GetPlotBar()
  {
    long temp = GetPlotBar_6();

    if (temp == 0) return null;
    return (vtkPlotBar)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPlotBarRangeHandlesItem() { super(); }

  public vtkPlotBarRangeHandlesItem(long id) { super(id); }
  public native long   VTKInit();

}

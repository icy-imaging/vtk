// java wrapper for vtkScalarsToColorsItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarsToColorsItem extends vtkPlot
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

  private native void SetUserBounds_5(double id0,double id1,double id2,double id3);
  public void SetUserBounds(double id0,double id1,double id2,double id3)
  {
    SetUserBounds_5(id0,id1,id2,id3);
  }

  private native void SetUserBounds_6(double id0[]);
  public void SetUserBounds(double id0[])
  {
    SetUserBounds_6(id0);
  }

  private native double[] GetUserBounds_7();
  public double[] GetUserBounds()
  {
    return GetUserBounds_7();
  }

  private native boolean Paint_8(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_8(id0);
  }

  private native long GetPolyLinePen_9();
  public vtkPen GetPolyLinePen()
  {
    long temp = GetPolyLinePen_9();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHistogramTable_10(vtkTable id0);
  public void SetHistogramTable(vtkTable id0)
  {
    SetHistogramTable_10(id0);
  }

  private native long GetHistogramTable_11();
  public vtkTable GetHistogramTable()
  {
    long temp = GetHistogramTable_11();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaskAboveCurve_12(boolean id0);
  public void SetMaskAboveCurve(boolean id0)
  {
    SetMaskAboveCurve_12(id0);
  }

  private native boolean GetMaskAboveCurve_13();
  public boolean GetMaskAboveCurve()
  {
    return GetMaskAboveCurve_13();
  }

  public vtkScalarsToColorsItem() { super(); }

  public vtkScalarsToColorsItem(long id) { super(id); }

}

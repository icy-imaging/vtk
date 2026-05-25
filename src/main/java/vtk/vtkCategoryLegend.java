// java wrapper for vtkCategoryLegend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCategoryLegend extends vtkChartLegend
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetScalarsToColors_5(vtkScalarsToColors id0);
  public void SetScalarsToColors(vtkScalarsToColors id0)
  {
    SetScalarsToColors_5(id0);
  }

  private native long GetScalarsToColors_6();
  public vtkScalarsToColors GetScalarsToColors()
  {
    long temp = GetScalarsToColors_6();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetValues_7();
  public vtkVariantArray GetValues()
  {
    long temp = GetValues_7();

    if (temp == 0) return null;
    return (vtkVariantArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetValues_8(vtkVariantArray id0);
  public void SetValues(vtkVariantArray id0)
  {
    SetValues_8(id0);
  }

  private native void SetTitle_9(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_9(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_10();
  public String GetTitle()
  {
    return new String(GetTitle_10(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutlierLabel_11();
  public String GetOutlierLabel()
  {
    return new String(GetOutlierLabel_11(), StandardCharsets.UTF_8);
  }

  private native void SetOutlierLabel_12(byte[] id0, int len0);
  public void SetOutlierLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutlierLabel_12(bytes0, bytes0.length);
  }

  public vtkCategoryLegend() { super(); }

  public vtkCategoryLegend(long id) { super(id); }
  public native long   VTKInit();

}

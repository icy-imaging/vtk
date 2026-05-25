// java wrapper for vtkLabeledContourPolyDataItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabeledContourPolyDataItem extends vtkPolyDataItem
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

  private native void SetTextProperty_5(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_5(id0);
  }

  private native void SetTextProperties_6(vtkTextPropertyCollection id0);
  public void SetTextProperties(vtkTextPropertyCollection id0)
  {
    SetTextProperties_6(id0);
  }

  private native long GetTextProperties_7();
  public vtkTextPropertyCollection GetTextProperties()
  {
    long temp = GetTextProperties_7();

    if (temp == 0) return null;
    return (vtkTextPropertyCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextPropertyMapping_8();
  public vtkDoubleArray GetTextPropertyMapping()
  {
    long temp = GetTextPropertyMapping_8();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextPropertyMapping_9(vtkDoubleArray id0);
  public void SetTextPropertyMapping(vtkDoubleArray id0)
  {
    SetTextPropertyMapping_9(id0);
  }

  private native void SetLabelVisibility_10(boolean id0);
  public void SetLabelVisibility(boolean id0)
  {
    SetLabelVisibility_10(id0);
  }

  private native boolean GetLabelVisibility_11();
  public boolean GetLabelVisibility()
  {
    return GetLabelVisibility_11();
  }

  private native void LabelVisibilityOn_12();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_12();
  }

  private native void LabelVisibilityOff_13();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_13();
  }

  private native void SetSkipDistance_14(double id0);
  public void SetSkipDistance(double id0)
  {
    SetSkipDistance_14(id0);
  }

  private native double GetSkipDistance_15();
  public double GetSkipDistance()
  {
    return GetSkipDistance_15();
  }

  public vtkLabeledContourPolyDataItem() { super(); }

  public vtkLabeledContourPolyDataItem(long id) { super(id); }
  public native long   VTKInit();

}

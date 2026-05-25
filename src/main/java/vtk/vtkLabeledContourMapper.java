// java wrapper for vtkLabeledContourMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabeledContourMapper extends vtkMapper
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

  private native void Render_4(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_4(id0,id1);
  }

  private native void SetInputData_5(vtkPolyData id0);
  public void SetInputData(vtkPolyData id0)
  {
    SetInputData_5(id0);
  }

  private native long GetInput_6();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetBounds_7(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_7(id0);
  }

  private native void SetTextProperty_8(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_8(id0);
  }

  private native void SetTextProperties_9(vtkTextPropertyCollection id0);
  public void SetTextProperties(vtkTextPropertyCollection id0)
  {
    SetTextProperties_9(id0);
  }

  private native long GetTextProperties_10();
  public vtkTextPropertyCollection GetTextProperties()
  {
    long temp = GetTextProperties_10();

    if (temp == 0) return null;
    return (vtkTextPropertyCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextPropertyMapping_11();
  public vtkDoubleArray GetTextPropertyMapping()
  {
    long temp = GetTextPropertyMapping_11();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextPropertyMapping_12(vtkDoubleArray id0);
  public void SetTextPropertyMapping(vtkDoubleArray id0)
  {
    SetTextPropertyMapping_12(id0);
  }

  private native void SetLabelVisibility_13(boolean id0);
  public void SetLabelVisibility(boolean id0)
  {
    SetLabelVisibility_13(id0);
  }

  private native boolean GetLabelVisibility_14();
  public boolean GetLabelVisibility()
  {
    return GetLabelVisibility_14();
  }

  private native void LabelVisibilityOn_15();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_15();
  }

  private native void LabelVisibilityOff_16();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_16();
  }

  private native void SetSkipDistance_17(double id0);
  public void SetSkipDistance(double id0)
  {
    SetSkipDistance_17(id0);
  }

  private native double GetSkipDistance_18();
  public double GetSkipDistance()
  {
    return GetSkipDistance_18();
  }

  private native long GetPolyDataMapper_19();
  public vtkPolyDataMapper GetPolyDataMapper()
  {
    long temp = GetPolyDataMapper_19();

    if (temp == 0) return null;
    return (vtkPolyDataMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_20(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_20(id0);
  }

  public vtkLabeledContourMapper() { super(); }

  public vtkLabeledContourMapper(long id) { super(id); }
  public native long   VTKInit();

}

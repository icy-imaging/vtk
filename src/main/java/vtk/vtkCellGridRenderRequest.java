// java wrapper for vtkCellGridRenderRequest object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridRenderRequest extends vtkCellGridQuery
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

  private native void SetMapper_4(vtkCellGridMapper id0);
  public void SetMapper(vtkCellGridMapper id0)
  {
    SetMapper_4(id0);
  }

  private native long GetMapper_5();
  public vtkCellGridMapper GetMapper()
  {
    long temp = GetMapper_5();

    if (temp == 0) return null;
    return (vtkCellGridMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActor_6(vtkActor id0);
  public void SetActor(vtkActor id0)
  {
    SetActor_6(id0);
  }

  private native long GetActor_7();
  public vtkActor GetActor()
  {
    long temp = GetActor_7();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_8(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_8(id0);
  }

  private native long GetRenderer_9();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_9();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWindow_10(vtkWindow id0);
  public void SetWindow(vtkWindow id0)
  {
    SetWindow_10(id0);
  }

  private native long GetWindow_11();
  public vtkWindow GetWindow()
  {
    long temp = GetWindow_11();

    if (temp == 0) return null;
    return (vtkWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native char GetShapesToDraw_12();
  public char GetShapesToDraw()
  {
    return GetShapesToDraw_12();
  }

  private native void SetShapesToDraw_13(char id0);
  public void SetShapesToDraw(char id0)
  {
    SetShapesToDraw_13(id0);
  }

  private native char GetShapesToDrawMinValue_14();
  public char GetShapesToDrawMinValue()
  {
    return GetShapesToDrawMinValue_14();
  }

  private native char GetShapesToDrawMaxValue_15();
  public char GetShapesToDrawMaxValue()
  {
    return GetShapesToDrawMaxValue_15();
  }

  private native boolean Initialize_16();
  public boolean Initialize()
  {
    return Initialize_16();
  }

  private native boolean Finalize_17();
  public boolean Finalize()
  {
    return Finalize_17();
  }

  private native boolean GetIsReleasingResources_18();
  public boolean GetIsReleasingResources()
  {
    return GetIsReleasingResources_18();
  }

  private native void SetIsReleasingResources_19(boolean id0);
  public void SetIsReleasingResources(boolean id0)
  {
    SetIsReleasingResources_19(id0);
  }

  public vtkCellGridRenderRequest() { super(); }

  public vtkCellGridRenderRequest(long id) { super(id); }
  public native long   VTKInit();

}

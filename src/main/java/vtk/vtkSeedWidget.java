// java wrapper for vtkSeedWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSeedWidget extends vtkAbstractWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void SetCurrentRenderer_5(vtkRenderer id0);
  public void SetCurrentRenderer(vtkRenderer id0)
  {
    SetCurrentRenderer_5(id0);
  }

  private native void SetInteractor_6(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_6(id0);
  }

  private native void SetRepresentation_7(vtkSeedRepresentation id0);
  public void SetRepresentation(vtkSeedRepresentation id0)
  {
    SetRepresentation_7(id0);
  }

  private native long GetSeedRepresentation_8();
  public vtkSeedRepresentation GetSeedRepresentation()
  {
    long temp = GetSeedRepresentation_8();

    if (temp == 0) return null;
    return (vtkSeedRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_9();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_9();
  }

  private native void SetProcessEvents_10(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_10(id0);
  }

  private native void CompleteInteraction_11();
  public void CompleteInteraction()
  {
    CompleteInteraction_11();
  }

  private native void RestartInteraction_12();
  public void RestartInteraction()
  {
    RestartInteraction_12();
  }

  private native long CreateNewHandle_13();
  public vtkHandleWidget CreateNewHandle()
  {
    long temp = CreateNewHandle_13();

    if (temp == 0) return null;
    return (vtkHandleWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeleteSeed_14(int id0);
  public void DeleteSeed(int id0)
  {
    DeleteSeed_14(id0);
  }

  private native long GetSeed_15(int id0);
  public vtkHandleWidget GetSeed(int id0)
  {
    long temp = GetSeed_15(id0);

    if (temp == 0) return null;
    return (vtkHandleWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetWidgetState_16();
  public int GetWidgetState()
  {
    return GetWidgetState_16();
  }

  public vtkSeedWidget() { super(); }

  public vtkSeedWidget(long id) { super(id); }
  public native long   VTKInit();

}

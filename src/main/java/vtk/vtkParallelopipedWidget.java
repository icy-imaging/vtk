// java wrapper for vtkParallelopipedWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelopipedWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_5(vtkParallelopipedRepresentation id0);
  public void SetRepresentation(vtkParallelopipedRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long GetParallelopipedRepresentation_6();
  public vtkParallelopipedRepresentation GetParallelopipedRepresentation()
  {
    long temp = GetParallelopipedRepresentation_6();

    if (temp == 0) return null;
    return (vtkParallelopipedRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnableChairCreation_7(int id0);
  public void SetEnableChairCreation(int id0)
  {
    SetEnableChairCreation_7(id0);
  }

  private native int GetEnableChairCreation_8();
  public int GetEnableChairCreation()
  {
    return GetEnableChairCreation_8();
  }

  private native void EnableChairCreationOn_9();
  public void EnableChairCreationOn()
  {
    EnableChairCreationOn_9();
  }

  private native void EnableChairCreationOff_10();
  public void EnableChairCreationOff()
  {
    EnableChairCreationOff_10();
  }

  private native void CreateDefaultRepresentation_11();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_11();
  }

  private native void SetProcessEvents_12(int id0);
  public void SetProcessEvents(int id0)
  {
    SetProcessEvents_12(id0);
  }

  public vtkParallelopipedWidget() { super(); }

  public vtkParallelopipedWidget(long id) { super(id); }
  public native long   VTKInit();

}

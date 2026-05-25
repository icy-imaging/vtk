// java wrapper for vtkMagnifierWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMagnifierWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkMagnifierRepresentation id0);
  public void SetRepresentation(vtkMagnifierRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetMagnifierRepresentation_5();
  public vtkMagnifierRepresentation GetMagnifierRepresentation()
  {
    long temp = GetMagnifierRepresentation_5();

    if (temp == 0) return null;
    return (vtkMagnifierRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_6();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_6();
  }

  private native void SetEnabled_7(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_7(id0);
  }

  private native void SetKeyPressIncreaseValue_8(char id0);
  public void SetKeyPressIncreaseValue(char id0)
  {
    SetKeyPressIncreaseValue_8(id0);
  }

  private native char GetKeyPressIncreaseValue_9();
  public char GetKeyPressIncreaseValue()
  {
    return GetKeyPressIncreaseValue_9();
  }

  private native void SetKeyPressDecreaseValue_10(char id0);
  public void SetKeyPressDecreaseValue(char id0)
  {
    SetKeyPressDecreaseValue_10(id0);
  }

  private native char GetKeyPressDecreaseValue_11();
  public char GetKeyPressDecreaseValue()
  {
    return GetKeyPressDecreaseValue_11();
  }

  public vtkMagnifierWidget() { super(); }

  public vtkMagnifierWidget(long id) { super(id); }
  public native long   VTKInit();

}

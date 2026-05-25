// java wrapper for vtkXMLWriter2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLWriter2 extends vtkXMLWriterBase
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfGhostLevels_6(int id0);
  public void SetNumberOfGhostLevels(int id0)
  {
    SetNumberOfGhostLevels_6(id0);
  }

  private native int GetNumberOfGhostLevelsMinValue_7();
  public int GetNumberOfGhostLevelsMinValue()
  {
    return GetNumberOfGhostLevelsMinValue_7();
  }

  private native int GetNumberOfGhostLevelsMaxValue_8();
  public int GetNumberOfGhostLevelsMaxValue()
  {
    return GetNumberOfGhostLevelsMaxValue_8();
  }

  private native int GetNumberOfGhostLevels_9();
  public int GetNumberOfGhostLevels()
  {
    return GetNumberOfGhostLevels_9();
  }

  public vtkXMLWriter2() { super(); }

  public vtkXMLWriter2(long id) { super(id); }

}

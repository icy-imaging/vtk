// java wrapper for vtkPOpenFOAMReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPOpenFOAMReader extends vtkOpenFOAMReader
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

  private native void SetCaseType_4(int id0);
  public void SetCaseType(int id0)
  {
    SetCaseType_4(id0);
  }

  private native int GetCaseType_5();
  public int GetCaseType()
  {
    return GetCaseType_5();
  }

  private native void SetController_6(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_6(id0);
  }

  private native long GetController_7();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_7();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPOpenFOAMReader() { super(); }

  public vtkPOpenFOAMReader(long id) { super(id); }
  public native long   VTKInit();

}

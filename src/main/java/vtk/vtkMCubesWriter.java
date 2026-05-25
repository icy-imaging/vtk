// java wrapper for vtkMCubesWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMCubesWriter extends vtkWriter
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

  private native void SetLimitsFileName_4(byte[] id0, int len0);
  public void SetLimitsFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLimitsFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetLimitsFileName_5();
  public String GetLimitsFileName()
  {
    return new String(GetLimitsFileName_5(), StandardCharsets.UTF_8);
  }

  private native long GetInput_6();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_7(int id0);
  public vtkPolyData GetInput(int id0)
  {
    long temp = GetInput_7(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  public vtkMCubesWriter() { super(); }

  public vtkMCubesWriter(long id) { super(id); }
  public native long   VTKInit();

}

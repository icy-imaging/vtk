// java wrapper for vtkEnSightReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnSightReader extends vtkGenericEnSightReader
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

  private native byte[] GetMeasuredFileName_4();
  public String GetMeasuredFileName()
  {
    return new String(GetMeasuredFileName_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetMatchFileName_5();
  public String GetMatchFileName()
  {
    return new String(GetMatchFileName_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetRigidBodyFileName_6();
  public String GetRigidBodyFileName()
  {
    return new String(GetRigidBodyFileName_6(), StandardCharsets.UTF_8);
  }

  public vtkEnSightReader() { super(); }

  public vtkEnSightReader(long id) { super(id); }

}

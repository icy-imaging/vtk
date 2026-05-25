// java wrapper for vtkRandomSequence object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomSequence extends vtkObject
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

  private native void Initialize_4(int id0);
  public void Initialize(int id0)
  {
    Initialize_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void Next_6();
  public void Next()
  {
    Next_6();
  }

  private native double GetNextValue_7();
  public double GetNextValue()
  {
    return GetNextValue_7();
  }

  public vtkRandomSequence() { super(); }

  public vtkRandomSequence(long id) { super(id); }

}

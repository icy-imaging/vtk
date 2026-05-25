// java wrapper for vtkMersenneTwister object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMersenneTwister extends vtkRandomSequence
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

  private native int InitializeNewSequence_5(int id0,int id1);
  public int InitializeNewSequence(int id0,int id1)
  {
    return InitializeNewSequence_5(id0,id1);
  }

  private native void InitializeSequence_6(int id0,int id1,int id2);
  public void InitializeSequence(int id0,int id1,int id2)
  {
    InitializeSequence_6(id0,id1,id2);
  }

  private native double GetValue_7(int id0);
  public double GetValue(int id0)
  {
    return GetValue_7(id0);
  }

  private native double GetValue_8();
  public double GetValue()
  {
    return GetValue_8();
  }

  private native void Next_9(int id0);
  public void Next(int id0)
  {
    Next_9(id0);
  }

  private native void Next_10();
  public void Next()
  {
    Next_10();
  }

  public vtkMersenneTwister() { super(); }

  public vtkMersenneTwister(long id) { super(id); }
  public native long   VTKInit();

}

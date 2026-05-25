// java wrapper for vtkMinimalStandardRandomSequence object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMinimalStandardRandomSequence extends vtkRandomSequence
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

  private native void SetSeed_5(int id0);
  public void SetSeed(int id0)
  {
    SetSeed_5(id0);
  }

  private native void SetSeedOnly_6(int id0);
  public void SetSeedOnly(int id0)
  {
    SetSeedOnly_6(id0);
  }

  private native int GetSeed_7();
  public int GetSeed()
  {
    return GetSeed_7();
  }

  private native double GetValue_8();
  public double GetValue()
  {
    return GetValue_8();
  }

  private native void Next_9();
  public void Next()
  {
    Next_9();
  }

  private native double GetRangeValue_10(double id0,double id1);
  public double GetRangeValue(double id0,double id1)
  {
    return GetRangeValue_10(id0,id1);
  }

  private native double GetNextRangeValue_11(double id0,double id1);
  public double GetNextRangeValue(double id0,double id1)
  {
    return GetNextRangeValue_11(id0,id1);
  }

  public vtkMinimalStandardRandomSequence() { super(); }

  public vtkMinimalStandardRandomSequence(long id) { super(id); }
  public native long   VTKInit();

}

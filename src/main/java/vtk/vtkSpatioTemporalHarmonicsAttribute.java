// java wrapper for vtkSpatioTemporalHarmonicsAttribute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpatioTemporalHarmonicsAttribute extends vtkDataSetAlgorithm
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

  private native void AddHarmonic_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void AddHarmonic(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    AddHarmonic_4(id0,id1,id2,id3,id4,id5);
  }

  private native void ClearHarmonics_5();
  public void ClearHarmonics()
  {
    ClearHarmonics_5();
  }

  private native boolean HasHarmonics_6();
  public boolean HasHarmonics()
  {
    return HasHarmonics_6();
  }

  private native double ComputeValue_7(double id0[],double id1);
  public double ComputeValue(double id0[],double id1)
  {
    return ComputeValue_7(id0,id1);
  }

  public vtkSpatioTemporalHarmonicsAttribute() { super(); }

  public vtkSpatioTemporalHarmonicsAttribute(long id) { super(id); }
  public native long   VTKInit();

}

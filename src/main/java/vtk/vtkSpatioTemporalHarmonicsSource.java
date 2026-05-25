// java wrapper for vtkSpatioTemporalHarmonicsSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpatioTemporalHarmonicsSource extends vtkImageAlgorithm
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

  private native void SetWholeExtent_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_5(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_5(id0);
  }

  private native int[] GetWholeExtent_6();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_6();
  }

  private native void AddTimeStepValue_7(double id0);
  public void AddTimeStepValue(double id0)
  {
    AddTimeStepValue_7(id0);
  }

  private native void ClearTimeStepValues_8();
  public void ClearTimeStepValues()
  {
    ClearTimeStepValues_8();
  }

  private native void ResetTimeStepValues_9();
  public void ResetTimeStepValues()
  {
    ResetTimeStepValues_9();
  }

  private native void AddHarmonic_10(double id0,double id1,double id2,double id3,double id4,double id5);
  public void AddHarmonic(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    AddHarmonic_10(id0,id1,id2,id3,id4,id5);
  }

  private native void ClearHarmonics_11();
  public void ClearHarmonics()
  {
    ClearHarmonics_11();
  }

  private native void ResetHarmonics_12();
  public void ResetHarmonics()
  {
    ResetHarmonics_12();
  }

  public vtkSpatioTemporalHarmonicsSource() { super(); }

  public vtkSpatioTemporalHarmonicsSource(long id) { super(id); }
  public native long   VTKInit();

}

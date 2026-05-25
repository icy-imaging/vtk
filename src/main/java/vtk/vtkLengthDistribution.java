// java wrapper for vtkLengthDistribution object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLengthDistribution extends vtkTableAlgorithm
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

  private native long GetSampleSize_4();
  public long GetSampleSize()
  {
    return GetSampleSize_4();
  }

  private native void SetSampleSize_5(long id0);
  public void SetSampleSize(long id0)
  {
    SetSampleSize_5(id0);
  }

  private native boolean GetSortSample_6();
  public boolean GetSortSample()
  {
    return GetSortSample_6();
  }

  private native void SetSortSample_7(boolean id0);
  public void SetSortSample(boolean id0)
  {
    SetSortSample_7(id0);
  }

  private native void SortSampleOn_8();
  public void SortSampleOn()
  {
    SortSampleOn_8();
  }

  private native void SortSampleOff_9();
  public void SortSampleOff()
  {
    SortSampleOff_9();
  }

  private native double GetLengthQuantile_10(double id0);
  public double GetLengthQuantile(double id0)
  {
    return GetLengthQuantile_10(id0);
  }

  public vtkLengthDistribution() { super(); }

  public vtkLengthDistribution(long id) { super(id); }
  public native long   VTKInit();

}

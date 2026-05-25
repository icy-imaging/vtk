// java wrapper for vtkPointOccupancyFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointOccupancyFilter extends vtkImageAlgorithm
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

  private native void SetSampleDimensions_4(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_4(id0,id1,id2);
  }

  private native void SetSampleDimensions_5(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_5(id0);
  }

  private native int[] GetSampleDimensions_6();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_6();
  }

  private native void SetModelBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_8(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_8(id0);
  }

  private native double[] GetModelBounds_9();
  public double[] GetModelBounds()
  {
    return GetModelBounds_9();
  }

  private native void SetEmptyValue_10(byte id0);
  public void SetEmptyValue(byte id0)
  {
    SetEmptyValue_10(id0);
  }

  private native byte GetEmptyValue_11();
  public byte GetEmptyValue()
  {
    return GetEmptyValue_11();
  }

  private native void SetOccupiedValue_12(byte id0);
  public void SetOccupiedValue(byte id0)
  {
    SetOccupiedValue_12(id0);
  }

  private native byte GetOccupiedValue_13();
  public byte GetOccupiedValue()
  {
    return GetOccupiedValue_13();
  }

  public vtkPointOccupancyFilter() { super(); }

  public vtkPointOccupancyFilter(long id) { super(id); }
  public native long   VTKInit();

}

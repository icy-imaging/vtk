// java wrapper for vtkExtractVOI object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractVOI extends vtkImageAlgorithm
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

  private native void SetVOI_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetVOI(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetVOI_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetVOI_5(int id0[]);
  public void SetVOI(int id0[])
  {
    SetVOI_5(id0);
  }

  private native int[] GetVOI_6();
  public int[] GetVOI()
  {
    return GetVOI_6();
  }

  private native void SetSampleRate_7(int id0,int id1,int id2);
  public void SetSampleRate(int id0,int id1,int id2)
  {
    SetSampleRate_7(id0,id1,id2);
  }

  private native void SetSampleRate_8(int id0[]);
  public void SetSampleRate(int id0[])
  {
    SetSampleRate_8(id0);
  }

  private native int[] GetSampleRate_9();
  public int[] GetSampleRate()
  {
    return GetSampleRate_9();
  }

  private native void SetIncludeBoundary_10(int id0);
  public void SetIncludeBoundary(int id0)
  {
    SetIncludeBoundary_10(id0);
  }

  private native int GetIncludeBoundary_11();
  public int GetIncludeBoundary()
  {
    return GetIncludeBoundary_11();
  }

  private native void IncludeBoundaryOn_12();
  public void IncludeBoundaryOn()
  {
    IncludeBoundaryOn_12();
  }

  private native void IncludeBoundaryOff_13();
  public void IncludeBoundaryOff()
  {
    IncludeBoundaryOff_13();
  }

  public vtkExtractVOI() { super(); }

  public vtkExtractVOI(long id) { super(id); }
  public native long   VTKInit();

}

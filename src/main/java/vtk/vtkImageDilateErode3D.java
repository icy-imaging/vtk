// java wrapper for vtkImageDilateErode3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDilateErode3D extends vtkImageSpatialAlgorithm
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

  private native void SetKernelSize_4(int id0,int id1,int id2);
  public void SetKernelSize(int id0,int id1,int id2)
  {
    SetKernelSize_4(id0,id1,id2);
  }

  private native void SetDilateValue_5(double id0);
  public void SetDilateValue(double id0)
  {
    SetDilateValue_5(id0);
  }

  private native double GetDilateValue_6();
  public double GetDilateValue()
  {
    return GetDilateValue_6();
  }

  private native void SetErodeValue_7(double id0);
  public void SetErodeValue(double id0)
  {
    SetErodeValue_7(id0);
  }

  private native double GetErodeValue_8();
  public double GetErodeValue()
  {
    return GetErodeValue_8();
  }

  public vtkImageDilateErode3D() { super(); }

  public vtkImageDilateErode3D(long id) { super(id); }
  public native long   VTKInit();

}

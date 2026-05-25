// java wrapper for vtkImageCheckerboard object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageCheckerboard extends vtkThreadedImageAlgorithm
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

  private native void SetNumberOfDivisions_4(int id0,int id1,int id2);
  public void SetNumberOfDivisions(int id0,int id1,int id2)
  {
    SetNumberOfDivisions_4(id0,id1,id2);
  }

  private native void SetNumberOfDivisions_5(int id0[]);
  public void SetNumberOfDivisions(int id0[])
  {
    SetNumberOfDivisions_5(id0);
  }

  private native int[] GetNumberOfDivisions_6();
  public int[] GetNumberOfDivisions()
  {
    return GetNumberOfDivisions_6();
  }

  private native void SetInput1Data_7(vtkDataObject id0);
  public void SetInput1Data(vtkDataObject id0)
  {
    SetInput1Data_7(id0);
  }

  private native void SetInput2Data_8(vtkDataObject id0);
  public void SetInput2Data(vtkDataObject id0)
  {
    SetInput2Data_8(id0);
  }

  public vtkImageCheckerboard() { super(); }

  public vtkImageCheckerboard(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkTrivialProducer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTrivialProducer extends vtkAlgorithm
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

  private native void SetOutput_4(vtkDataObject id0);
  public void SetOutput(vtkDataObject id0)
  {
    SetOutput_4(id0);
  }

  private native long GetMTime_5();
  public long GetMTime()
  {
    return GetMTime_5();
  }

  private native void SetWholeExtent_6(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetWholeExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetWholeExtent_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWholeExtent_7(int id0[]);
  public void SetWholeExtent(int id0[])
  {
    SetWholeExtent_7(id0);
  }

  private native int[] GetWholeExtent_8();
  public int[] GetWholeExtent()
  {
    return GetWholeExtent_8();
  }

  private native void FillOutputDataInformation_9(vtkDataObject id0,vtkInformation id1);
  public void FillOutputDataInformation(vtkDataObject id0,vtkInformation id1)
  {
    FillOutputDataInformation_9(id0,id1);
  }

  public vtkTrivialProducer() { super(); }

  public vtkTrivialProducer(long id) { super(id); }
  public native long   VTKInit();

}

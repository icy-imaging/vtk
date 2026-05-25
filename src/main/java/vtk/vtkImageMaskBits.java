// java wrapper for vtkImageMaskBits object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMaskBits extends vtkThreadedImageAlgorithm
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

  private native void SetMasks_4(int id0,int id1,int id2,int id3);
  public void SetMasks(int id0,int id1,int id2,int id3)
  {
    SetMasks_4(id0,id1,id2,id3);
  }

  private native void SetMask_5(int id0);
  public void SetMask(int id0)
  {
    SetMask_5(id0);
  }

  private native void SetMasks_6(int id0,int id1);
  public void SetMasks(int id0,int id1)
  {
    SetMasks_6(id0,id1);
  }

  private native void SetMasks_7(int id0,int id1,int id2);
  public void SetMasks(int id0,int id1,int id2)
  {
    SetMasks_7(id0,id1,id2);
  }

  private native void SetOperation_8(int id0);
  public void SetOperation(int id0)
  {
    SetOperation_8(id0);
  }

  private native int GetOperation_9();
  public int GetOperation()
  {
    return GetOperation_9();
  }

  private native void SetOperationToAnd_10();
  public void SetOperationToAnd()
  {
    SetOperationToAnd_10();
  }

  private native void SetOperationToOr_11();
  public void SetOperationToOr()
  {
    SetOperationToOr_11();
  }

  private native void SetOperationToXor_12();
  public void SetOperationToXor()
  {
    SetOperationToXor_12();
  }

  private native void SetOperationToNand_13();
  public void SetOperationToNand()
  {
    SetOperationToNand_13();
  }

  private native void SetOperationToNor_14();
  public void SetOperationToNor()
  {
    SetOperationToNor_14();
  }

  public vtkImageMaskBits() { super(); }

  public vtkImageMaskBits(long id) { super(id); }
  public native long   VTKInit();

}

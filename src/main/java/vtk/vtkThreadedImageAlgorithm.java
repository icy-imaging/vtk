// java wrapper for vtkThreadedImageAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThreadedImageAlgorithm extends vtkImageAlgorithm
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

  private native void ThreadedExecute_4(vtkImageData id0,vtkImageData id1,int id2[],int id3);
  public void ThreadedExecute(vtkImageData id0,vtkImageData id1,int id2[],int id3)
  {
    ThreadedExecute_4(id0,id1,id2,id3);
  }

  private native boolean GetEnableSMP_5();
  public boolean GetEnableSMP()
  {
    return GetEnableSMP_5();
  }

  private native void SetEnableSMP_6(boolean id0);
  public void SetEnableSMP(boolean id0)
  {
    SetEnableSMP_6(id0);
  }

  private native void SetGlobalDefaultEnableSMP_7(boolean id0);
  public void SetGlobalDefaultEnableSMP(boolean id0)
  {
    SetGlobalDefaultEnableSMP_7(id0);
  }

  private native boolean GetGlobalDefaultEnableSMP_8();
  public boolean GetGlobalDefaultEnableSMP()
  {
    return GetGlobalDefaultEnableSMP_8();
  }

  private native void SetMinimumPieceSize_9(int id0,int id1,int id2);
  public void SetMinimumPieceSize(int id0,int id1,int id2)
  {
    SetMinimumPieceSize_9(id0,id1,id2);
  }

  private native void SetMinimumPieceSize_10(int id0[]);
  public void SetMinimumPieceSize(int id0[])
  {
    SetMinimumPieceSize_10(id0);
  }

  private native int[] GetMinimumPieceSize_11();
  public int[] GetMinimumPieceSize()
  {
    return GetMinimumPieceSize_11();
  }

  private native void SetDesiredBytesPerPiece_12(long id0);
  public void SetDesiredBytesPerPiece(long id0)
  {
    SetDesiredBytesPerPiece_12(id0);
  }

  private native long GetDesiredBytesPerPiece_13();
  public long GetDesiredBytesPerPiece()
  {
    return GetDesiredBytesPerPiece_13();
  }

  private native void SetSplitMode_14(int id0);
  public void SetSplitMode(int id0)
  {
    SetSplitMode_14(id0);
  }

  private native int GetSplitModeMinValue_15();
  public int GetSplitModeMinValue()
  {
    return GetSplitModeMinValue_15();
  }

  private native int GetSplitModeMaxValue_16();
  public int GetSplitModeMaxValue()
  {
    return GetSplitModeMaxValue_16();
  }

  private native void SetSplitModeToSlab_17();
  public void SetSplitModeToSlab()
  {
    SetSplitModeToSlab_17();
  }

  private native void SetSplitModeToBeam_18();
  public void SetSplitModeToBeam()
  {
    SetSplitModeToBeam_18();
  }

  private native void SetSplitModeToBlock_19();
  public void SetSplitModeToBlock()
  {
    SetSplitModeToBlock_19();
  }

  private native int GetSplitMode_20();
  public int GetSplitMode()
  {
    return GetSplitMode_20();
  }

  private native void SetNumberOfThreads_21(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_21(id0);
  }

  private native int GetNumberOfThreadsMinValue_22();
  public int GetNumberOfThreadsMinValue()
  {
    return GetNumberOfThreadsMinValue_22();
  }

  private native int GetNumberOfThreadsMaxValue_23();
  public int GetNumberOfThreadsMaxValue()
  {
    return GetNumberOfThreadsMaxValue_23();
  }

  private native int GetNumberOfThreads_24();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_24();
  }

  private native int SplitExtent_25(int id0[],int id1[],int id2,int id3);
  public int SplitExtent(int id0[],int id1[],int id2,int id3)
  {
    return SplitExtent_25(id0,id1,id2,id3);
  }

  public vtkThreadedImageAlgorithm() { super(); }

  public vtkThreadedImageAlgorithm(long id) { super(id); }

}

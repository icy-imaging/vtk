// java wrapper for vtkTesting object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTesting extends vtkObject
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

  private native void FrontBufferOn_4();
  public void FrontBufferOn()
  {
    FrontBufferOn_4();
  }

  private native void FrontBufferOff_5();
  public void FrontBufferOff()
  {
    FrontBufferOff_5();
  }

  private native int GetFrontBuffer_6();
  public int GetFrontBuffer()
  {
    return GetFrontBuffer_6();
  }

  private native void SetFrontBuffer_7(int id0);
  public void SetFrontBuffer(int id0)
  {
    SetFrontBuffer_7(id0);
  }

  private native int RegressionTest_8(double id0);
  public int RegressionTest(double id0)
  {
    return RegressionTest_8(id0);
  }

  private native int RegressionTest_9(double id0,byte[] id1, int len1);
  public int RegressionTest(double id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return RegressionTest_9(id0,bytes1, bytes1.length);
  }

  private native int RegressionTest_10(byte[] id0, int len0,double id1);
  public int RegressionTest(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RegressionTest_10(bytes0, bytes0.length,id1);
  }

  private native int RegressionTest_11(byte[] id0, int len0,double id1,byte[] id2, int len2);
  public int RegressionTest(String id0,double id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return RegressionTest_11(bytes0, bytes0.length,id1,bytes2, bytes2.length);
  }

  private native int RegressionTest_12(vtkAlgorithm id0,double id1);
  public int RegressionTest(vtkAlgorithm id0,double id1)
  {
    return RegressionTest_12(id0,id1);
  }

  private native int RegressionTest_13(vtkAlgorithm id0,double id1,byte[] id2, int len2);
  public int RegressionTest(vtkAlgorithm id0,double id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return RegressionTest_13(id0,id1,bytes2, bytes2.length);
  }

  private native int CompareAverageOfL2Norm_14(vtkDataSet id0,vtkDataSet id1,double id2);
  public int CompareAverageOfL2Norm(vtkDataSet id0,vtkDataSet id1,double id2)
  {
    return CompareAverageOfL2Norm_14(id0,id1,id2);
  }

  private native int CompareAverageOfL2Norm_15(vtkDataArray id0,vtkDataArray id1,double id2);
  public int CompareAverageOfL2Norm(vtkDataArray id0,vtkDataArray id1,double id2)
  {
    return CompareAverageOfL2Norm_15(id0,id1,id2);
  }

  private native void SetRenderWindow_16(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_16(id0);
  }

  private native long GetRenderWindow_17();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_17();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetMesaVersion_18(vtkRenderWindow id0,int id1[]);
  public boolean GetMesaVersion(vtkRenderWindow id0,int id1[])
  {
    return GetMesaVersion_18(id0,id1);
  }

  private native void SetValidImageFileName_19(byte[] id0, int len0);
  public void SetValidImageFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidImageFileName_19(bytes0, bytes0.length);
  }

  private native byte[] GetValidImageFileName_20();
  public String GetValidImageFileName()
  {
    return new String(GetValidImageFileName_20(), StandardCharsets.UTF_8);
  }

  private native double GetImageDifference_21();
  public double GetImageDifference()
  {
    return GetImageDifference_21();
  }

  private native void AddArgument_22(byte[] id0, int len0);
  public void AddArgument(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddArgument_22(bytes0, bytes0.length);
  }

  private native byte[] GetArgument_23(byte[] id0, int len0);
  public String GetArgument(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetArgument_23(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native void CleanArguments_24();
  public void CleanArguments()
  {
    CleanArguments_24();
  }

  private native byte[] GetDataRoot_25();
  public String GetDataRoot()
  {
    return new String(GetDataRoot_25(), StandardCharsets.UTF_8);
  }

  private native void SetDataRoot_26(byte[] id0, int len0);
  public void SetDataRoot(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDataRoot_26(bytes0, bytes0.length);
  }

  private native byte[] GetTempDirectory_27();
  public String GetTempDirectory()
  {
    return new String(GetTempDirectory_27(), StandardCharsets.UTF_8);
  }

  private native void SetTempDirectory_28(byte[] id0, int len0);
  public void SetTempDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTempDirectory_28(bytes0, bytes0.length);
  }

  private native int IsValidImageSpecified_29();
  public int IsValidImageSpecified()
  {
    return IsValidImageSpecified_29();
  }

  private native int IsInteractiveModeSpecified_30();
  public int IsInteractiveModeSpecified()
  {
    return IsInteractiveModeSpecified_30();
  }

  private native int IsFlagSpecified_31(byte[] id0, int len0);
  public int IsFlagSpecified(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsFlagSpecified_31(bytes0, bytes0.length);
  }

  private native void SetBorderOffset_32(int id0);
  public void SetBorderOffset(int id0)
  {
    SetBorderOffset_32(id0);
  }

  private native int GetBorderOffset_33();
  public int GetBorderOffset()
  {
    return GetBorderOffset_33();
  }

  private native void SetVerbose_34(int id0);
  public void SetVerbose(int id0)
  {
    SetVerbose_34(id0);
  }

  private native int GetVerbose_35();
  public int GetVerbose()
  {
    return GetVerbose_35();
  }

  private native long GetController_36();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_36();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetController_37(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_37(id0);
  }

  public vtkTesting() { super(); }

  public vtkTesting(long id) { super(id); }
  public native long   VTKInit();

}
